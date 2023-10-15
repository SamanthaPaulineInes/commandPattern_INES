package LabHw5_INES_3BSCS1_CommandPattern;
import java.util.ArrayList;
import java.util.List;
public class App
{
    private List<Command> commands = new ArrayList<>();

    void addCommand(Command command)
    {
        commands.add(command);
    }
    void executeCommand()
    {
        for(Command command:commands)
        {
            command.execute();
        }
    }
}
