module.exports={
    default:{

        "formatOptions":{
                "snippetInterface":"async-await"
        },

        requireModule:[
            "ts-node/register"
        ],

        require:[
            "src/test/stepDefinitions/**/*.ts",
            "src/test/hooks/hooks.ts",
            "src/test/world/world.ts",
            "src/test/support/**/*.ts"
        ],

        paths:[
            "src/test/features/**/*.feature"
        ],

        publishQuiet:true,
        dryRun:false,

        format:[
            "progress",
            "json:reports/Json_Report/Json-report.json",
            "html:reports/Html_Report/Html-report.html",
            "rerun:reports/Rerun/rerun.txt"
        ],
        parallel:1

    },

    rerun:{

        "formatOptions":{
                "snippetInterface":"async-await"
        },

        requireModule:[
            "ts-node/register"
        ],

        require:[
            "src/test/stepDefinitions/**/*.ts",
            "src/test/hooks/hooks.ts",
            "src/test/world/world.ts",
            "src/test/support/**/*.ts"
        ],

        paths:[
            "reports/Rerun/rerun.txt"
        ],

        publishQuiet:true,
        dryRun:false,

        format:[
            "progress",
            "json:reports/Json-report.json",
            "html:reports/Html-report.html",
            "rerun:@rerun.txt"
        ],
        parallel:2

    }
}