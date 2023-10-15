package LabHw5_INES_3BSCS1_CommandPattern;
public class TurnOffSwitch implements Command
{
    private Device device;
    public TurnOffSwitch(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.turnOff();
    }
}
