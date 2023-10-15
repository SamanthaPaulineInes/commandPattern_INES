package LabHw5_INES_3BSCS1_CommandPattern;

public class IncreaseTemp implements Command
{
    private Device device;
    public IncreaseTemp(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.increaseTemp();
    }
}
