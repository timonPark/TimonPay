package me.timonpay.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

	@Getter
	private final String membershipId;

	@Getter
	private final String name;

	@Getter
	private final String email;

	@Getter
	private final String address;

	@Getter
	private final boolean isValid;

	@Getter
	private final boolean isCorp;

	// Membershop
	// 오염이 되면 안되는 클래스, 고객 정보, 핵심 도메인
	public static Membership generateMember(
			MembershipId membershipId,
			MembershipName membershipName,
			MembershipEmail membershipEmail,
			MembershipAdderess membershipAdderess,
			MembershipIsValid membershipIsValid,
			MembershipIsCorp membershipIsCorp) {
		return new Membership(
				membershipId.membershipIdValue,
				membershipName.nameValue,
				membershipEmail.emailValue,
				membershipAdderess.addressValue,
				membershipIsValid.isValidValue,
				membershipIsCorp.isCorpValue
		);
	}

	@Value
	public static class MembershipId {
		String membershipIdValue;
		public MembershipId(String value) {
			this.membershipIdValue = value;
		}
	}

	@Value
	public static class MembershipName {
		String nameValue;
		public MembershipName(String value) {
			this.nameValue = value;
		}
	}

	@Value
	public static class MembershipEmail {
		String emailValue;
		public MembershipEmail(String value) {
			this.emailValue = value;
		}
	}

	@Value
	public static class MembershipAdderess {
		String addressValue;
		public MembershipAdderess(String value) {
			this.addressValue = value;
		}
	}

	@Value
	public static class MembershipIsValid {
		boolean isValidValue;
		public MembershipIsValid(boolean value) {
			this.isValidValue = value;
		}
	}

	@Value
	public static class MembershipIsCorp {
		boolean isCorpValue;
		public MembershipIsCorp(boolean value) {
			this.isCorpValue = value;
		}
	}
}
