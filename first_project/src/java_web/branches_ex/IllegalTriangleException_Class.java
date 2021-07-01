package java_web.branches_ex;

public class IllegalTriangleException_Class {
    private double edge_A, edge_B, edge_C;

    public IllegalTriangleException_Class(double edge_A, double edge_B, double edge_C) {
        this.edge_A = edge_A;
        this.edge_B = edge_B;
        this.edge_C = edge_C;
    }

    public double getEdge_A() {
        return edge_A;
    }

    public void setEdge_A(double edge_A) {
        this.edge_A = edge_A;
    }

    public double getEdge_B() {
        return edge_B;
    }

    public void setEdge_B(double edge_B) {
        this.edge_B = edge_B;
    }

    public double getEdge_C() {
        return edge_C;
    }

    public void setEdge_C(double edge_C) {
        this.edge_C = edge_C;
    }

    public void validateTriangle() throws Exception {
        if (edge_A<0 | edge_B<0 | edge_C<0)
            throw new Exception();
        if (validateEdge(edge_A, edge_B, edge_C) ||
                validateEdge(edge_B, edge_A, edge_C) ||
                        validateEdge(edge_C, edge_A, edge_B) )
            throw new Exception();
    }
    private boolean validateEdge(double edge_first, double edge_second, double edge_third)
    {
        return edge_first> (edge_second+edge_third);
    }
}
