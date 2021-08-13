package pacote2;

import pacote1.ClassePublic1;

public class ClassePublic2 {

	public void mtdPublic() {

	}

	protected void mtdProtected() {

	}

	void mtdDefault() {

	}

	private void mtdPrivate() {

	}

	public static void main(String[] args) {

		ClassePublic1 cls = new ClassePublic1();

		cls.mtdPublic();
		// cls.mtdProtected(); método protected permite acesso apenas as classes e
		// subclasses de seu pacote
		// cls.mtdDefault(); método default só pode ser utilizado em seu pacote de
		// origem
		// cls.mtdPrivate(); método privado só permite acesso na sua classe de origem

		// ClasseDefault1 cls2 = new ClasseDefault1(); classe default não permite acesso
		// fora do seu pacote de origem

		ClassePublic2 cls3 = new ClassePublic2();

		cls3.mtdPublic();
		cls3.mtdProtected();
		cls3.mtdDefault();
		cls3.mtdPrivate();

		ClasseDefault2 cls4 = new ClasseDefault2();

		cls4.mtdPublic();
		cls4.mtdProtected();
		cls4.mtdDefault();
		// cls4.mtdPrivate(); método private impede a chamada fora da sua classe de
		// origem

	}

}
