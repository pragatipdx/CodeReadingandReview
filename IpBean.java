public class IpBean implements Comparable<IpBean> // this is the class made to compare the Ips
{
    long startip;
    long endip;
    String[] area;

    @Override
    public int compareTo(IpBean otherBean) // comparing IP input with the .dat file to display the location of IP
    {
        if (otherBean.startip < startip || otherBean.startip > endip) {
            if (startip > otherBean.startip) {
                return 1;
            } else if (startip < otherBean.startip) {
                return -1;
            }
        }
        return 0;
    }
}
