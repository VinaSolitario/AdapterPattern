class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateAttendance() {
        // Not applicable for this adapter
    }

    @Override
    public void integrateGrades() {
        gradingSystem.recordGrades();
    }

    @Override
    public void integrateLibrary() {
        // Not applicable for this adapter
    }
}