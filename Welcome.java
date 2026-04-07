import java.util.Scanner;

public class Welcome {
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름" + name + "연락처" + mobile );
	}
	public static void menuCartItemList() {
		System.out.println("2.장바구니 상품 목록 보기 : ");
	}
	public static void menuCartClear() {
		System.out.println("3.장바구니 비우기");
	}
	public static void menuCartAddItem() {
		System.out.println("4.바구니에 항목 추가하기 ");
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5.장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() {
		System.out.println("6.장바구니의 항목 삭제하기");
	}
	public static void menuCartBill() {
		System.out.println("7.영수증 표시하기");
	}
	public static void menuExit() {
		System.out.println("8.종료");
	}
	public static void menuIntroduction() {
		System.out.println("****************************************");
		System.out.println(" 1. 고객 정보 확인 하기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6.장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8.종료");
		System.out.println("****************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("당신의 이름을 입력하세요 : ");
	String userName = input.next();
	System.out.println("연락처를 입력하세요 : ");
	int userMobile = input.nextInt();
	String greeting = "Welcome to Shopping Mall";
	String tagline = "Welcome to Book Market!";
	boolean quit = false;
	while(!quit) {
		System.out.println("****************************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		menuIntroduction();
		System.out.print("메뉴를 선택해 주세요");
		int n = input.nextInt();
		if (n<1 || n>8) {
			System.out.println("1부터 8까지의 숫자를 입력하세요.");
		}else {
			switch (n) {
			case 1:
				 	menuGuestInfo(userName, userMobile);
					break;
			case 2:
					menuCartItemList();
					break;
			case 3:
					menuCartClear();
					break;
			case 4:
					menuCartAddItem();
					break;
			case 5:
					menuCartRemoveItemCount();
					break;
			case 6:
					menuCartRemoveItem();
					break;
			case 7:
					menuCartBill();
					break;
			case 8:
					menuExit();
					quit = true;
					break;
				}
			}
		} input.close();
	}
}
