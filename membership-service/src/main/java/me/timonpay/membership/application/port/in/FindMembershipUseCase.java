package me.timonpay.membership.application.port.in;

import me.timonpay.membership.domain.Membership;

public interface FindMembershipUseCase {

	Membership findMembership(FindMembershipCommand command);
	Membership findAxonMembership(FindMembershipCommand command);

}
