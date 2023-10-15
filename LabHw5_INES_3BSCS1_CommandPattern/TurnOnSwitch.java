package LabHw5_INES_3BSCS1_CommandPattern;

public class TurnOnSwitch implements Command
{
    private Device device;
    public TurnOnSwitch(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.turnOn();
    }
}
