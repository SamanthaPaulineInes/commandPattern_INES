package LabHw5_INES_3BSCS1_CommandPattern;

public class DecreaseTemp implements Command
{
    private Device device;
    public DecreaseTemp(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.decreaseTemp();
    }
}
