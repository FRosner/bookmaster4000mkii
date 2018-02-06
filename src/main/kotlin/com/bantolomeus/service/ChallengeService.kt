package com.bantolomeus.service

import com.bantolomeus.dto.ChallengeDTO
import com.bantolomeus.repository.ChallengeRepository
import org.springframework.stereotype.Service

@Service
class ChallengeService(private val challengeRepository: ChallengeRepository) {

    open fun getData(): ChallengeDTO? {
        return challengeRepository.getChallenge()
    }

}