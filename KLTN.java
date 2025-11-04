package org.example;

class KLTN<T, V> implements Comparable<KLTN<?, ?>> {
    private T student;
    private V supervisor;
    private String thesisName;

    public KLTN(T student, V supervisor, String thesisName) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisName = thesisName;
    }

    public String getThesisName() { return thesisName; }

    @Override
    public int compareTo(KLTN<?, ?> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "KLTN[Thesis='" + thesisName + "', " + student + ", Supervisor=" + supervisor + "]";
    }
}
