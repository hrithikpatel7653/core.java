package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {

	public static void main(String[] args) throws Exception {

//		for (int i = 1; i <= 50; i++) {
//
//			System.out.println("Collection:" + i);
//
//		}

		// testAdd();
		// testSearch();
		// testDelete();
		// testNextPk();
		// testFindById();
		// testSearch2();
		testAunthenticate();
	}

	private static void testAunthenticate() throws Exception {

		UserBean bea = new UserBean();

		bea.setLoginId("anu@rma");
		bea.setPassword("anu1234");
		

			UserModel model = new UserModel();

			UserBean bean = model.authenticate(bea.getLoginId(), bea.getPassword());

			System.out.println(bean.getId());
			System.out.println(bean.getFistName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLoginId());
			System.out.println(bean.getPassword());
			System.out.println(bean.getMobileNo());
		
	}

	private static void testSearch2() throws Exception {

		UserBean bean = new UserBean();

		bean.setFistName("v");

		UserModel model = new UserModel();

		List<UserBean> list = model.search2(bean);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			UserBean bean1 = it.next();

			System.out.print(bean1.getId());
			System.out.print("\t" + bean1.getFistName());
			System.out.print("\t" + bean1.getLastName());
			System.out.print("\t" + bean1.getLoginId());
			System.out.print("\t" + bean1.getPassword());
			System.out.println("\t" + bean1.getMobileNo());
		}

	}

	private static void testFindById() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.FindById(6);

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFistName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.println("\t" + bean.getMobileNo());

		} else {
			System.out.println("This Rollno does not exits.....!!!!!");
		}

	}

	private static void testNextPk() throws Exception {

		UserModel model = new UserModel();

		System.out.println("Next Id :" + model.nextPk());

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();

		model.delete(12);

	}

	private static void testSearch() throws Exception {

		UserModel model = new UserModel();

		List<UserBean> list = model.search();

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			UserBean bean = it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFistName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.println("\t" + bean.getMobileNo());

		}

	}

	private static void testAdd() throws Exception {

		UserBean bean = new UserBean();

		// bean.setId(12);
		bean.setFistName("Vaishali");
		bean.setLastName("Soni");
		bean.setLoginId("vaishu@soni");
		bean.setPassword("vaishu1234");
		bean.setMobileNo("7879065432");

		UserModel model = new UserModel();

		model.Add(bean);

	}

}
