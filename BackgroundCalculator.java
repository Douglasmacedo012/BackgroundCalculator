import javax.swing.SwingWorker;
import javax.swing.JLabel;
import Java.util.concurrent.ExecutionException;

public class backgroundcalculator extends SwingWorker<Long, Object> 
{
    private final int n;
    private final JLabel resultJLabel;

    public backgroundcalculator(int n, JLabel resuJLabel)
    {
    
        this.n = n;
        this.resultJLabel = resuJLabel;
    }


    public Long doInBackground ()
    {
        long nthFib;
        return nthFib = fibonacci(n);
    }


    protected void done()
    {
        try
        {
            resultJLabel.setText(get().toStting());

    }
    catch (InterruptedException ex)
    }

}
