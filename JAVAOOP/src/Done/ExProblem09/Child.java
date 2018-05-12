package ExProblem09;

public class Child {
    private String _name;
    private String _birthday;

    Child (String name, String birthday) {
        this._name = name;
        this._birthday = birthday;
    }

    @Override
    public String toString () {
        return this._name + " " + this._birthday;
    }
}
