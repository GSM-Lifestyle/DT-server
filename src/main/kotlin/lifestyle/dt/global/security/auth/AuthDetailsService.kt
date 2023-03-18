package lifestyle.dt.global.security.auth

import lifestyle.dt.domain.user.domain.repository.UserRepository
import lifestyle.dt.domain.user.exception.UserNotFoundException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AuthDetailsService(
    private val userRepository: UserRepository
): UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails =
        userRepository.findByEmail(username)
            .let { it ?: throw UserNotFoundException() }
            .let { AuthDetails(it) }
}