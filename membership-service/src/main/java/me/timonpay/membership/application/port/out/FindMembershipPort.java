package me.timonpay.membership.application.port.out;

import me.timonpay.membership.domain.Membership;

public interface FindMembershipPort {

	Membership findMembership(
			Membership.MembershipId membershipId
	);

}
