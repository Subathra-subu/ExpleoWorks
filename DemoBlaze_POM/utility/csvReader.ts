import fs from 'fs';
import path from 'path';
import {parse} from 'csv-parse/sync';

export interface loginuser{
    username:string,
    password:string,
    errormessage:string

}

export function readLoginData():loginuser[]{
    const filepath = path.resolve(__dirname,'../testData/invalidData.csv');

    const fileContent = fs.readFileSync(filepath,'utf-8');

    return parse(fileContent,{
        columns:true,
        skip_empty_lines:true,
        trim:true
    })as loginuser[]
}