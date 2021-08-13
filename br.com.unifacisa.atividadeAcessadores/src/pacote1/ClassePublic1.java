package pacote1;

import pacote2.ClassePublic2;

public class ClassePublic1 {

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
		cls.mtdProtected();
		cls.mtdDefault();
		cls.mtdPrivate();

		ClasseDefault1 cls2 = new ClasseDefault1();

		cls2.mtdPublic();
		cls2.mtdProtected();
		cls2.mtdDefault();
		// cls2.mtdPrivate(); m�todo privado s� permite acesso na sua classe de origem

		ClassePublic2 cls3 = new ClassePublic2();

		cls3.mtdPublic();
		// cls3.mtdProtected(); m�todo s� pode ser acessado por classes e subclasses de
		// outro pacote
		// cls3.mtdDefault(); m�todo � acessado apenas pelo mesmo pacote
		// cls3.mtdPrivate(); m�todo privado, acesso permitido apenas na sua pr�pria
		// classe

		// ClasseDefault2 cls4 = new ClasseDefault2(); default n�o pode ser utilizado
		// fora do pacote de origem
	}

}
