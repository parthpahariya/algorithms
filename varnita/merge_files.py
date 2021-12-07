# Copyright 2011-2021 VMware, Inc. All rights reserved.

import pandas as pd
import numpy as np
import os
from pandas import ExcelWriter
from pathlib import Path
import csv

headers = ['VIS_MON', 'VIS_YR', 'VIS_DATE', 'STORE_NBR', 'INVOICE_NUMBER', 'MEMBERSHIP_NBR', 'CARD_HOLDER_NBR', 'CARD_TYPE', 'MEMBER_SEGMENT', 'ITEM_NUMBER', 'ITEM_DESCRIPTION', 'BRAND', 'CAT_NBR', 'SUB_DIVISION', 'DIVISION', 'BU', 'CHANNEL_ADD_ON', 'CHANNEL_NEW', 'CHANNEL_OLD', 'BEAT_INSTORE', 'SALES', 'COST', 'UNITS']

months = ["Jan",
          "Feb",
          "Mar",
          "April",
          "May",
          "June",
          "July",
          "Aug",
          "Sept",
          "Oct",
          "Nov",
          "Dec"]

# year, no. of the part yearly data downloaded
years = {
         "2021": 7
         }

file_list = ["df_Condiments_Spices_Dry_Fruits",
             "df_Dairy",
             "df_Food_Grain_Flour",
             "df_Fresh_Bakery",
             "df_Frozen_Non_Veg",
             "df_Frozen_Veg",
             "df_Oils_Cooking_Fats",
             "df_Sweets_Fresh_Bakery",
             "df_Tobacco"]

file_type = [".csv", ".txt"]

basedir = "/Users/ppahariya/Downloads/"

#
def read_data(dict):

        for year in dict.keys():
            with open(basedir + year + " 2021.csv", "a") as my_csv:
                csvWriter = csv.writer(my_csv, delimiter=',')
                csvWriter.writerow(headers)
                path_list = dict[year]
                for file in path_list:
                    print(file)
                    # if file[-3:] == "csv":
                    #
                    #     # continue
                    #     # data = pd.read_csv(file, delimiter=',')
                    #     # array = np.array(data)
                    #     # array = np.delete(array, 0,  axis=1)
                    #     print("no csv")
                    # else:
                    data = pd.read_csv(file, delimiter='\t')
                    array = np.array(data)
                    # total_data.append(list(array))

                    for row in array:
                        csvWriter.writerow(list(row))


# get path of all the file needed
def get_path():
    dict = {}
    for year in years.keys():
        for month in months:
            path_list = []
            file_count = 0
            if year == "2019" and month not in ["Oct", "Nov", "Dec"]:
                continue
            for file in file_list:
                count = 0
                for type in file_type:
                    for part in range(1, years[year] + 1):
                        file_name = basedir + year + " Data " + str(part) + "/" + month + " " + year + "/" + file + type
                        my_file = Path(file_name)
                        if my_file.is_file():
                            path_list.append(file_name)
                            count = count + 1
                if count == 1:
                    file_count = file_count + 1
                else:
                    print("no file " + file_name)
            dict.update({month: path_list})
            # if file_count == len(file_list):
            #     print("all file is present for " +year + " " + month)

    return dict



if __name__ == "__main__":

    dict = get_path()
    print(dict)
    read_data(dict)
