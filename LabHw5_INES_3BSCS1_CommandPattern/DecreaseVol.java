package LabHw5_INES_3BSCS1_CommandPattern;

public class DecreaseVol implements Command
{
    private Device device;
    public DecreaseVol(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.decreaseVol();
    }
}
