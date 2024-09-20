class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateAttendance() {
        attendanceSystem.markAttendance();
    }

    @Override
    public void integrateGrades() {
        // Not applicable for this adapter
    }

    @Override
    public void integrateLibrary() {
        // Not applicable for this adapter
    }
}
