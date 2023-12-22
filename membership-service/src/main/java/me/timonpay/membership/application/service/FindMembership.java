package me.timonpay.membership.application.service;

import lombok.RequiredArgsConstructor;
import me.timonpay.common.UseCase;
import me.timonpay.membership.application.port.in.FindMembershipCommand;
import me.timonpay.membership.application.port.in.FindMembershipUseCase;
import me.timonpay.membership.application.port.out.FindMembershipPort;
import me.timonpay.membership.domain.Membership;
import me.timonpay.membership.domain.Membership.MembershipId;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class FindMembership implements FindMembershipUseCase {

	private final FindMembershipPort fport;

	@Override public Membership findMembership(final FindMembershipCommand command) {
		return fport.findMembership(new MembershipId(command.getMembershipId()));
	}

	@Override public Membership findAxonMembership(final FindMembershipCommand command) {
		return null;
	}
}
