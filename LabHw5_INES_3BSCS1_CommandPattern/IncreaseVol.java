package LabHw5_INES_3BSCS1_CommandPattern;

public class IncreaseVol implements Command
{
    private Device device;
    public IncreaseVol(Device device)
    {
        this.device = device;
    }
    @Override
    public String execute()
    {
        return device.increaseVol();
    }
}
