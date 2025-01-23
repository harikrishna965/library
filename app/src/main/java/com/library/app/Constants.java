package com.library.app;

import java.text.SimpleDateFormat;

public final class Constants {
    public static final String SYSTEM_ACCOUNT = "System";
    public static final String DEV_PROFILE = "dev";
    public static final String PROD_PROFILE = "prod";
    public static final String SPRING_PROFILE_DEFAULT = "spring.profiles.default";
    public static final String SYSTEM_ADMIN_USERNAME = "ms.admin";
    public static final String SYSTEM_ADMIN_PASSWORD = "Design9!";
    public static final String DEFAULT_TENANT = "Default";
    public static final String MERIT_HUB_URL = "https://serviceaccount1.meritgraph.com";
    public  static  final String MERIT_HUB_SCHEDULE_URL = "https://class1.meritgraph.com";
    public static String MERIT_HUB_JWT_TOKEN = "";
    public static String MERIT_HUB_ACCESS_TOKEN = "";
    public static String WHEEBOX_ACCESS_TOKEN = "";
	public static String MAPS = "MAPS";
    public static final String MERIT_HUB_CLIENT_ID = "c4mabbackrg8u409rj4g";
    public static final String MERIT_HUB_CLIENT_SECRET = "$2a$04$orfEgvkUlj0HOhVdpsmmlejKATbM7K6T7QuHko7qQ4l9t4nVnVhXS";

    public static final String SUFFIX = "/";
    public static final String NCERT_FOLDER_NAME = "ncert";
    public static final String TENANT_FOLDER_NAME = "tenant";
    public static final long MAX_FREE_TRAIL_PERIOD = 2592000000L; // 30 days in milliseconds
    public static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("dd/MM/yyyy");
    public static final String TIME_ZONE = "Asia/Calcutta";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
    public static final SimpleDateFormat SIMPLE_TIME_FORMAT = new SimpleDateFormat("hh:mm:ss aaa");
    public static final SimpleDateFormat SIMPLE_ONLY_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    public static final String PROFILE_IMAGES="profileImages";
    public static final String PROFILE_IMAGES_FACULTY="staff";
    public static final String PROFILE_IMAGES_STUDENTS="student";
    public static final String PROFILE_IMAGES_PARENTS="parent";
    
    public static final String PREFIX_ENQUIRY="E";
    public static final String PREFIX_ADMISSION="A";
    public static final String PREFIX_ADMISSION_PARENT="EP";
	public static final String DEFAULT_TENANT_PREFIX = "DF";
	public static final String INTERVIEW = "INTERVIEW";
	public static final String PREFIX_PAYMENT="PAY";
	public static final String STUDENT_PREFIX = "S";
	public static final String PARENT_PREFIX = "P";
	public static final String LOGO = "logo";
	public static final String ORG_PICS = "orgpics";
	public static final String BACKCOVER = "backcover";
	public static final int SCHOOL = 2;
	public static final int SECTION = 1;
	public static final int ONE_ONE = 3;
	public static final int FACULTY=4;
	public static final int ENTIRE_FACULTY=5;
	public static final int SYSTEM = 0;
	public static final int DRAFT = 0;
	public static final int PUBLISHED = 1;
	public static final int REVOKED = 2;
	public static final int CLEANED = 3;
	public static final String GROUPACTCOVER = "grpacts";
    public static final String PersonalProfile = "pProfile";
	public static final String ASSGN = "assgn";
	public static final String driver = "driver";
	public static final String SUPPLIER_DOC="supplier";
	public static final String PURCHASE_REQ="prchaserqst";
	public static final String GENERATE_ITEM="generateitem";
	public static final String AES_SECRET_KEY = "$$mapmyclasses.com$$";
	public static final String[] STUDENT_RSRCS = { "Dashboard", "Notification", "Subjects", "Events", "Assignments",
			"Group Activity", "Shared Content", "QuizExams", "Practice", "Results", "Attendance", "TimeTable", "Fee Collection" };
	public static final String[] PARENT_RSRCS = { "Dashboard", "Notification", "Subjects", "Events", "Assignments",
			"Group Activity", "QuizExams", "Results", "Attendance", "TimeTable", "Fee Collection" };
    public static final String ENEDETAILS = "enedetail";
	public static final String INVENTORY = "attachments";
	public static final String RETURN_REPORT = "RRLog";
	public static final String HOSTEL_PERSONAL = "hostelPersonal";
    private Constants() {
    }
}
