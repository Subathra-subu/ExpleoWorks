import fs from 'fs';
import path from 'path';
import {parse} from 'csv-parse/sync';

export interface searchItem{
    searchitem:string
}

export function readSearchData():searchItem[]{
    const filepath = path.resolve(__dirname,'../../../testData/searchData.csv');

    const fileContent = fs.readFileSync(filepath,'utf-8');

    return parse(fileContent,{
        columns:true,
        skip_empty_lines:true,
        trim:true
    })as searchItem[]
}