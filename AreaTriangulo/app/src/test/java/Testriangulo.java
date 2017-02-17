/**
 * Created by teo on 16/02/2017.
 */

public class Testriangulo {

    int ladoa;
    int ladob;
    int ladoc;

    public boolean ValidarTriangulo()
    {
        if ((ladoa+ladob)<ladoc)
        {
            return false;

        }
        else
        {
            return  true;
        }
    }

}
