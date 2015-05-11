package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;

public class Goal2GoalCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	private int index;
	
	public Goal2GoalCommand(UsData usData, IstarData istarData, int index) {
		super(istarData);
		this.usData = usData;
		this.index = index;
	}
	
	@Override
	public Object execute() {
		IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
		new_element.setName(usData.getUs_elements().get(index).getDescription());
		new_element.setType(IstarElementType.GOAL);
		getIstarData().getIstar_elements().add(new_element);
		return true;
	}


}