class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) {
            return false;
        }
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//      In all case scenarios, that is the only one sapying can fail, so there is no need for multiples checks
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return false;
        }
        return true;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//      That is the only case scenario when signaling can work so no more checks are needed also
        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return true;
//      That is the only case scenario where the method can fail but must be check second, otherwise the test will always fail
        } else if (archerIsAwake || !petDogIsPresent) {
            return false;
        }
        return true;
    }
}