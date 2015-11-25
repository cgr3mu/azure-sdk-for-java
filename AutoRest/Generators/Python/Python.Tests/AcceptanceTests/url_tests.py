import unittest
import subprocess
import sys
import isodate
import tempfile
from datetime import date, datetime, timedelta
import os
from os.path import dirname, pardir, join, realpath, sep, pardir

cwd = dirname(realpath(__file__))
root = realpath(join(cwd , pardir, pardir, pardir, pardir, pardir))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrest"))

tests = realpath(join(cwd, pardir, "Expected", "AcceptanceTests"))
sys.path.append(join(tests, "Url"))

from msrest.exceptions import DeserializationError

from auto_rest_url_test_service import AutoRestUrlTestService, AutoRestUrlTestServiceConfiguration
from auto_rest_url_test_service.models.enums import UriColor


class UrlTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):

        config = AutoRestUrlTestServiceConfiguration('', base_url="http://localhost:3000")
        config.log_level = 10
        cls.client = AutoRestUrlTestService(config)
        return super(UrlTests, cls).setUpClass()

    def test_url_path(self):

        self.client.config.global_string_path = ''

        self.client.paths.byte_empty(bytearray())

        with self.assertRaises(ValueError):
            self.client.paths.byte_null(None)

        u_bytes = bytearray(u"\u554A\u9F44\u4E02\u72DB\u72DC\uF9F1\uF92C\uF9F1\uFA0C\uFA29", encoding='utf-8')
        self.client.paths.byte_multi_byte(u_bytes)

        with self.assertRaises(ValueError):
            self.client.paths.date_null(None)

        with self.assertRaises(ValueError):
            self.client.paths.date_time_null(None)

        self.client.paths.date_time_valid(isodate.parse_datetime("2012-01-01T01:01:01Z"))
        self.client.paths.date_valid(isodate.parse_date("2012-01-01"))

        self.client.paths.double_decimal_negative(-9999999.999)
        self.client.paths.double_decimal_positive(9999999.999)

        self.client.paths.float_scientific_negative(-1.034e-20)
        self.client.paths.float_scientific_positive(1.034e+20)
        self.client.paths.get_boolean_false(False)
        self.client.paths.get_boolean_true(True)
        self.client.paths.get_int_negative_one_million(-1000000)
        self.client.paths.get_int_one_million(1000000)
        self.client.paths.get_negative_ten_billion(-10000000000)
        self.client.paths.get_ten_billion(10000000000)
        self.client.paths.string_empty("")

        with self.assertRaises(ValueError):
            self.client.paths.string_null(None)

        self.client.paths.string_url_encoded(r"begin!*'();:@ &=+$,/?#[]end")
        self.client.paths.enum_valid(UriColor.greencolor)

        with self.assertRaises(ValueError):
            self.client.paths.enum_null(None)

    def test_url_query(self):

        self.client.config.global_string_path = ''

        self.client.queries.byte_empty(bytearray())
        u_bytes = bytearray(u"\u554A\u9F44\u4E02\u72DB\u72DC\uF9F1\uF92C\uF9F1\uFA0C\uFA29", encoding='utf-8')
        self.client.queries.byte_multi_byte(u_bytes)
        self.client.queries.byte_null(None)
        self.client.queries.date_null(None)
        self.client.queries.date_time_null(None)
        self.client.queries.date_time_valid(isodate.parse_datetime("2012-01-01T01:01:01Z"))
        self.client.queries.date_valid(isodate.parse_date("2012-01-01"))
        self.client.queries.double_null(None)
        self.client.queries.double_decimal_negative(-9999999.999)
        self.client.queries.double_decimal_positive(9999999.999)
        self.client.queries.float_scientific_negative(-1.034e-20)
        self.client.queries.float_scientific_positive(1.034e20)
        self.client.queries.float_null(None)
        self.client.queries.get_boolean_false(False)
        self.client.queries.get_boolean_true(True)
        self.client.queries.get_boolean_null(None)
        self.client.queries.get_int_negative_one_million(-1000000)
        self.client.queries.get_int_one_million(1000000)
        self.client.queries.get_int_null(None)
        self.client.queries.get_negative_ten_billion(-10000000000)
        self.client.queries.get_ten_billion(10000000000)
        self.client.queries.get_long_null(None)
        self.client.queries.string_empty("")
        self.client.queries.string_null(None)
        self.client.queries.string_url_encoded("begin!*'();:@ &=+$,/?#[]end")
        self.client.queries.enum_valid(UriColor.greencolor)
        self.client.queries.enum_null(None)
        self.client.queries.array_string_csv_empty([])
        self.client.queries.array_string_csv_null(None)
        test_array = ["ArrayQuery1", r"begin!*'();:@ &=+$,/?#[]end", None, ""]
        self.client.queries.array_string_csv_valid(test_array)
        self.client.queries.array_string_pipes_valid(test_array)
        self.client.queries.array_string_ssv_valid(test_array)
        self.client.queries.array_string_tsv_valid(test_array)

    def test_url_mixed(self):

        self.client.config.global_string_path = "globalStringPath"
        self.client.config.global_string_query = "globalStringQuery"

        self.client.path_items.get_all_with_values("localStringPath", "pathItemStringPath",
                "localStringQuery", "pathItemStringQuery")

        self.client.config.global_string_query = None
        self.client.path_items.get_global_and_local_query_null("localStringPath", "pathItemStringPath",
                None, "pathItemStringQuery")

        self.client.path_items.get_global_query_null("localStringPath", "pathItemStringPath",
                "localStringQuery", "pathItemStringQuery")

        self.client.config.global_string_query = "globalStringQuery"
        self.client.path_items.get_local_path_item_query_null("localStringPath", "pathItemStringPath", 
                None, None)

if __name__ == '__main__':
    unittest.main()