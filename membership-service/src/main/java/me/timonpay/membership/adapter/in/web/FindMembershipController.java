package me.timonpay.membership.adapter.in.web;

import lombok.RequiredArgsConstructor;
import me.timonpay.common.WebAdapter;
import me.timonpay.membership.application.port.in.FindMembershipCommand;
import me.timonpay.membership.application.port.in.FindMembershipUseCase;
import me.timonpay.membership.domain.Membership;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class FindMembershipController {

	private final FindMembershipUseCase findMembershipUseCase;

	@GetMapping(path = "/membership/{membershipId}")
	ResponseEntity<Membership> findMembershipByMemberId(@PathVariable String membershipId) {
		return ResponseEntity.ok(
				findMembershipUseCase.findMembership(
						FindMembershipCommand.builder()
							.membershipId(membershipId)
							.build()
				)
		);
	}

}
