package BuggySoftware;

/*
Releasing software can be tricky and sometimes we release new versions of our software with bugs.
When we release a version with a bug it’s referred to as a bad release.
Your product manager has just informed you that a bug you created was released in one of the past versions and has caused all versions that have been released since to also be bad.
Given that your past releases are numbered from zero to N and you have a helper function isBadRelease(int releaseNumber)
that takes a version number and returns a boolean as to whether or not the given release number is bad, return the release number that your bug was initially shipped in.
Note: You should minimize your number of calls made to isBadRelease().

Ex: Given the following value N…

N = 5 and release number four is the release your bug was shipped in...
isBadRelease(3) // returns false.
isBadRelease(5) // returns true.
isBadRelease(4) // returns true.

return 4.


Time Complexity: O(logN) because binary search reduces the search by half with each iteration.
Space Complexity : O(1) becuase we are using a constant amount of additional space.

 */

public class BuggySoftware {

    public boolean isBadRealease(int releaseNumber) {
        int firstRealease = 4;

        return releaseNumber >= firstRealease;
    }

    public int findFirstBadRelease(int N) {

        int left = 0;
        int right = N;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadRealease(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        // no add the static on the method define new instance

        BuggySoftware software = new BuggySoftware();
        System.out.println("bad release " + software.findFirstBadRelease(5));

    }

}
