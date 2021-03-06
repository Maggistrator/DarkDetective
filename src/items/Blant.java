package items;

import core.Item;
import core.Player;
import it.marteEngine.entity.Entity;
import logic.Monster;

public class Blant extends Item {

	float speed = 1;
	int damage = 10;
	float block = 0.5f;
	float dodge = 0.2f;
	
	public Blant(Player player) {
		super("�������", "textures/MagicBook.png", player);
		TYPE = "WEARPON";
		stats.add("���: ������");
		stats.add("�����: 1.2 ��");
		stats.add("���� �����: "+block*100+"%");
		stats.add("���� �������: "+dodge*100+"%");
		stats.add("����: "+damage);
		stats.add("��������: "+speed);
		stats.add("��������: ��������� �������");
		
	}
	
	//��� �������� �����
	@Override
	public void effect(Entity target) {
		if(target instanceof Monster){
		Monster monster = (Monster)target;
		monster.getHitted(damage);
		}else if(target instanceof Player)
			player.wearpon = new Gun(player);
		else System.out.println("���� ��������, ������ �������");
	}

}
