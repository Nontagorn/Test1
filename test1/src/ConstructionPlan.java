import java.util.ArrayList;
import java.util.List;
class ConstructionPlan {
    private List<Statement> statements;

    public ConstructionPlan() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public void execute() {
        for (Statement statement : statements) {
            statement.execute();
        }
    }
}