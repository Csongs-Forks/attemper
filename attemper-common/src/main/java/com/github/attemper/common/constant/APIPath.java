package com.github.attemper.common.constant;

import com.github.attemper.java.sdk.common.constant.SdkAPIPath;

/**
 * @author ldang
 */
public class APIPath {

    public static final String API_PATH = SdkAPIPath.API_PATH;

    private static final String SYS = SdkAPIPath.SYS;

    private static final String DISPATCH = SdkAPIPath.DISPATCH;

    private static final String APP = "/app";

    private static final String STATISTICS = "/statistics";

    private static final String SCHEDULER = "/scheduler";

    private static final String EXECUTOR = "/executor";

    private static final String _GET = "/get";

    private static final String _PUBLISH = "/publish";
    
    public static final class LoginPath {

        public static final String INFO = SdkAPIPath.LoginPath.$ + "/info";
    }

    public static final class TenantPath {
        public static final String SUB_PATH = "/tenant";

        public static final String $ = API_PATH + SYS + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String TAG = $ + TagPath.SUB_PATH;
    }

    public static final class TagPath {
        public static final String SUB_PATH = "/tag";

        public static final String $ = API_PATH + SYS + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String TENANT = $ + TenantPath.SUB_PATH;

        public static final String RESOURCE = $ + "/resource";
    }

    public static final class JobPath {

        public static final String SUB_PATH = "/job";

        public static final String $ = API_PATH + DISPATCH + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String ENABLE = $ + "/enable";

        public static final String DISABLE = $ + "/disable";

        public static final String PUBLISH = $ + _PUBLISH;

        public static final String CONTENT = $ + "/content";

        public static final String VERSIONS = $ + "/versions";

        public static final String COPY = $ + "/copy";

        public static final String EXCHANGE = $ + "/exchange";

        public static final String MANUAL_BATCH = $ + "/manual/batch";

        public static final String MANUAL = $ + "/manual";

        public static final String EXPORT_MODEL = $ + "/export/model";

        public static final String IMPORT_MODEL = $ + "/import/model";

        public static final String GET_PROJECT = $ + "/project";

        public static final String SAVE_PROJECT = $ + "/project";

        public static final String ARG = $ + ArgPath.SUB_PATH;

        public static final String JSON_ARG = $ + ArgPath.SUB_PATH + "/json";
    }

    public static final class TriggerPath {
        public static final String SUB_PATH = "/trigger";

        public static final String UPDATE = API_PATH + DISPATCH + SUB_PATH;

        public static final String GET = API_PATH + DISPATCH + SUB_PATH + _GET;

        public static final String GET_CALENDAR = API_PATH + DISPATCH + SUB_PATH + CalendarPath.SUB_PATH + _GET;
    }

    public static final class ArgPath {
        public static final String SUB_PATH = "/arg";

        public static final String $ = API_PATH + DISPATCH + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String GET_SQL_RESULT = $ + "/sql";

        public static final String GET_TRADE_DATE = $ + "/trade_date";
    }

    public static final class DataSourcePath {
        public static final String SUB_PATH = "/datasource";

        public static final String $ = API_PATH + DISPATCH + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String TEST_CONNECTION = $ + "/test";

    }

    public static final class CalendarPath {
        public static final String SUB_PATH = "/calendar";

        public static final String $ = API_PATH + DISPATCH + SUB_PATH;

        public static final String DAY = $ + "/day";

        public static final String TIME = $ + "/time";
    }

    public static final class ProjectPath {
        public static final String SUB_PATH = "/project";

        public static final String $ = API_PATH + APP + SUB_PATH;

        public static final String LIST_TREE = API_PATH + APP + SUB_PATH + "/treeList";

        public static final String INFO = API_PATH + APP + SUB_PATH + "/info";

        public static final String EXECUTOR = API_PATH + APP + SUB_PATH + "/executor";

    }

    public static final class ProgramPath {
        public static final String SUB_PATH = "/program";

        public static final String $ = API_PATH + APP + SUB_PATH;

        public static final String GET = $ + _GET;

        public static final String PACKAGE = $ + "/package";

        public static final String PACKAGE_CATEGORY = PACKAGE + "/category";

        public static final String UPLOAD_PACKAGE = PACKAGE + "/upload";

        public static final String DOWNLOAD_PACKAGE = PACKAGE + "/download";

        public static final String LOAD_PACKAGE = PACKAGE + "/load";

        public static final String UNLOAD_PACKAGE = PACKAGE + "/unload";

        public static final String VIEW_FILE = PACKAGE + "/file/view";

        public static final String DOWNLOAD_FILE = PACKAGE + "/file/download";
    }

    public static final class InstancePath {
        private static final String SUB_PATH = "/instance";

        public static final String $ = API_PATH + DISPATCH + SUB_PATH;

        public static final String CHILDREN = $ + "/children";

        public static final String RETRY = $ + "/retry";

        public static final String RETRY_CHILDREN = RETRY + "/children";

        public static final String TERMINATE = $ + "/terminate";

        public static final String LIST_ACT = $ + "/act";
    }

    public static final class CountPath {
        private static final String SUB_PATH = "/count";

        public static final String TENANT = API_PATH + STATISTICS + SUB_PATH + TenantPath.SUB_PATH;

        public static final String JOB = API_PATH + STATISTICS + SUB_PATH + JobPath.SUB_PATH;

        public static final String INSTANCE = API_PATH + STATISTICS + SUB_PATH + InstancePath.SUB_PATH;
    }

    public static final class ToolPath {
        public static final String SUB_PATH = "/tool";

        public static final String GET_TIME_ZONE = API_PATH + DISPATCH + SUB_PATH + "/timeZone";

        public static final String LIST_EXECUTOR_SERVICE = API_PATH + DISPATCH + SUB_PATH + "/executor";

        public static final String PING = API_PATH + DISPATCH + SUB_PATH + "/ping";

        public static final String TIME = API_PATH + DISPATCH + SUB_PATH + "/time";

        public static final String ARG_TYPES = API_PATH + DISPATCH + SUB_PATH + "/argTypes";

        public static final String TRADE_DATE_UNITS = API_PATH + DISPATCH + SUB_PATH + "/tradeDateUnits";

    }

    public static final class SchedulerPath {

        public static final String TRIGGER = API_PATH + SCHEDULER + TriggerPath.SUB_PATH;

        public static final String CALENDAR = API_PATH + SCHEDULER + CalendarPath.SUB_PATH;
    }

    public static final class ExecutorPath {

        public static final String JOB_INVOKING = API_PATH + EXECUTOR + "/invoke";

        public static final String TERMINATE = API_PATH + EXECUTOR + "/terminate";

        public static final String LOAD_PACKAGE = API_PATH + EXECUTOR + "/package/load";

        public static final String UNLOAD_PACKAGE = API_PATH + EXECUTOR + "/package/unload";
    }
}
