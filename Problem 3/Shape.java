public abstact class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String tostring() {
        return "Shape: " + name;
    }
}
