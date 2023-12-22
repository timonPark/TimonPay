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
	private final String aggregateIdentifier;

	// Membershop
	// 오염이 되면 안되는 클래스, 고객 정보, 핵심 도메인
	public static Membership generateMember(
			MembershipId membershipId,
			MembershipName membershipName,
			MembershipEmail membershipEmail,
			MembershipAdderess membershipAdderess,
			MembershipIsValid membershipIsValid,
			MembershipAggregateIdentifier membershipAggregateIdentifier) {
		return new Membership(
				membershipId.membershipId,
				membershipName.name,
				membershipEmail.email,
				membershipAdderess.address,
				membershipIsValid.isValid,
				membershipAggregateIdentifier.aggregateIdentifier
		);
	}

	@Value
	public static class MembershipId {
		public MembershipId(String value) {
			this.membershipId = value;
		}
		String membershipId;
	}

	@Value
	public static class MembershipName {
		public MembershipName(String value) {
			this.name = value;
		}
		String name;
	}

	@Value
	public static class MembershipEmail {
		public MembershipEmail(String value) {
			this.email = value;
		}
		String email;
	}

	@Value
	public static class MembershipAdderess {
		public MembershipAdderess(String value) {
			this.address = value;
		}
		String address;
	}

	@Value
	public static class MembershipIsValid {
		public MembershipIsValid(boolean value) {
			this.isValid = value;
		}
		boolean isValid;
	}

	@Value
	public static class MembershipAggregateIdentifier {
		public MembershipAggregateIdentifier(String value) {
			this.aggregateIdentifier = value;
		}
		String aggregateIdentifier;
	}
}
