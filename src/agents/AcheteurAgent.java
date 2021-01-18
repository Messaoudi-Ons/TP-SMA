package agents;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class AcheteurAgent extends Agent {
	private String livre;
	
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("serial")
	@Override
	protected void setup ()
	{   Object[] params = getArguments();
	      livre=params[0].toString();
	    System.out.println("****************");
		System.out.println("deploiement de l'agent "+getAID().getName());
		System.out.println("je vais tenter d'acheter le livre "+ livre  );
		System.out.println("****************");
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
		ParallelBehaviour parallelBehaviour=new ParallelBehaviour();
		addBehaviour(parallelBehaviour);
		/*
		parallelBehaviour.addSubBehaviour(new TickerBehaviour(this,2000)
        		{
             private int counter;
             @Override
             protected void onTick() {
            	 System.out.println("Tick"+(++counter));
             }
        		});
		
		parallelBehaviour.addSubBehaviour(new CyclicBehaviour()
			
		{
			private int counter=1;	
			   @Override
	             public void action() {
	            	 System.out.println("Tentative numéro"+(++counter));
			   }
				});
				/*
 
		/*
		 try {
		 
		addBehaviour( new WakerBehaviour(this,dateFormat.parse("18/01/2020:12:10:00"))
				{
			    @Override
			    protected void onWake() {
			    	System.out.println("Tache planifiée");
			    }
				});
		} catch(ParseException e)
		{
			e.printStackTrace();
		}
		/*
		 addBehaviour(new CyclicBehaviour()
		 
				{
				private int counter=1;
		@Override
		public void action() {
		System.out.println("Tentative numéro"+(++counter));
		}
			
	});
	/*
		*/
		/*
		addBehaviour(new OneShotBehaviour() 
		{
			
			
			

			@Override
			public void action() {
				System.out.println(""); 
			}
		});
		*/
		
		
		
		
		/*
		 * addBehaviour(new Behaviour() {
		 
             private int counter=0;
			
			private static final long serialVersionUID = 1L;

              
			@Override
			public boolean done() {
				// TODO Auto-generated method stub
				if(counter==10) return true; 
				else return false;
			}	
        	
			@Override
			public void action() {
				System.out.println("Tentative d'acheter le livre+" +livre+" =>" +counter);
				++counter;
			}
			
			@Override
			public void onStart() {
				System.out.println("Début de la tache");
			
			}
			
			@Override
			public int onEnd() {
				System.out.println("Fin de la tache");
			
                return counter;
             }
    
        });
        */
	} 

	@Override
	protected void beforeMove ()
	{
		System.out.println("****************");
		System.out.println("Avant migration de l'agent"+getAID().getLocalName());
		System.out.println("****************");
	}
	@Override
	protected void afterMove ()
	{
		System.out.println("****************");
		System.out.println("Après migration de l'agent"+getAID().getLocalName());
		System.out.println("****************");
	}
	@Override
	protected void takeDown ()
	{
		System.out.println("****************");
		System.out.println("Je suis en train de mourir...");
		System.out.println("****************");
	}
	

}
