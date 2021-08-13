package pacote2;

import pacote1.ClassePublic1;

class ClasseDefault2 {

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
		// cls.mtdProtected();
		// cls.mtdDefault();
		// cls.mtdPrivate(); método privado só permite acesso na sua classe de origem

		// ClasseDefault1 cls2 = new ClasseDefault1();

		ClassePublic2 cls3 = new ClassePublic2();

		cls3.mtdPublic();
		cls3.mtdProtected(); 
		cls3.mtdDefault();
		// cls3.mtdPrivate(); método privado, acesso permitido apenas na sua própria
		// classe

		ClasseDefault2 cls4 = new ClasseDefault2();

		cls4.mtdPublic();
		cls4.mtdProtected();
		cls4.mtdDefault();
		cls4.mtdPrivate();
	}

}
