var isPalindrome = function(s) {
    let cleanedString = cleanString(s);
    let reversedString = reverseString(cleanedString);
    return reversedString === cleanedString;
};

function reverseString(s) {
    return s.split('').reverse().join('');
};

function cleanString(s) {
    let lowerCaseString = s.toLowerCase();
    let cleanedString = lowerCaseString.replace(/[^a-z0-9]/g, '');
    return cleanedString;
};