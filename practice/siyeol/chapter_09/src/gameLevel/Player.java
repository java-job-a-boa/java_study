package gameLevel;

public class Player {
	private PlayerLevel level; // PLayer�� ������ level ���� ����
	// ����Ʈ ������.
	// ó�� �����Ǹ� BegginerLevel�� �����ϸ� ���� �޽��� ���
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	// ���� ���� �޼���.
	// ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
	public void upgradeLevel(PlayerLevel level) { // �Ű� ���� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count); // PlayerLevel�� ���ø� �޼��� go() ȣ��
	}

}
