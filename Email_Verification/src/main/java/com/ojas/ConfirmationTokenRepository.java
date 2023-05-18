package com.ojas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.ConfirmationToken;
@Repository("confirmationTokenRepository")
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, String>{
ConfirmationToken findByConfirmationToken(String confirmationToken);
}
