public class SchoolManagementAppMain {
    public static void main(String[] args) {
        // Create instances of the existing systems (adaptees)
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Create adapters for the systems
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Integrate systems using the adapters
        System.out.println("Integrating School Management Systems:");
        attendanceAdapter.integrateAttendance();
        gradingAdapter.integrateGrades();
        libraryAdapter.integrateLibrary();
    }
}