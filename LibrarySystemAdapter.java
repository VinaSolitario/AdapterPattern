class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateAttendance() {
        // Not applicable for this adapter
    }

    @Override
    public void integrateGrades() {
        // Not applicable for this adapter
    }

    @Override
    public void integrateLibrary() {
        librarySystem.manageBooks();
    }
}
