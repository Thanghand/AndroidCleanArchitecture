import { Strategy, ExtractJwt } from 'passport-jwt';
import { Passport } from "passport";

/**
 * passport jwt configuration
 */
export class PassportConfig {
  
    public passport: Passport;

    constructor(passport: any) {
        this.passport = passport;
    }

    public init() {
        let opts = {
            jwtFromRequest: ExtractJwt.fromAuthHeader(),
            secretOrKey: process.env.APPLICATION_SECRET
        };

        this.passport.use(new Strategy(opts, (jwtPayload, done) => {
            // TODO: Add user here 
        }));
    }
}