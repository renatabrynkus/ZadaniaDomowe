package model;

public class Bug {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean isClosed;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.isClosed = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description must contain 10 characters or more.");
        }
        else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Please enter a valid email address.");
        }
        else {
            this.email = email;
        }
    }

    public void setBugPriority(int bugPriority) {
        if ((bugPriority < 1) || (bugPriority > 5)) {
            System.out.println("Bug priority must be between 1 and 5.");
        }
        else {
            this.bugPriority = bugPriority;
        }
    }
    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }



    public void showAllData() {
        System.out.println("This is the description of the bug: " + bugDescription
                + ", email of the person who reported the bug: " + email
                + ", priority: " + bugPriority
                + " and is the bug closed: " + isClosed);
    }

    public void showWhoReported() {
        System.out.println("The bug was reported by " + email);
    }

    public void showBugStatus() {
        System.out.println("Is this bug closed? " + isClosed);
    }

    public int getBugPriority() {
        return bugPriority;
    }
}