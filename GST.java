package GST;


/* java program to compute GST 
 * from original price & net price */
public class GST {
	
	static float Calculate_GST(float org_cost, float N_price)
	
	{ 
		// return value after calculating GST%
		return (((N_price - org_cost) * 100) / org_cost);
		
	}

	
	public static void main (String[] args)
	
	{
		float org_cost = 15000;
				float N_price = 18000;
				System.out.println("GST = " + Calculate_GST
						(org_cost, N_price) + " % ");
	
	}

	}
