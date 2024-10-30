var isValid = function(s) {
    let openingStatements = []; // We create an array to include every opening statement we encounter in the string
    for (let i = 0; i < s.length; i++) { // We loop through the string
        if (s[i] === "(" || s[i] === "{" || s[i] === "[") { // Checking if current index is an opening statement
            openingStatements.push(s[i]); // Add the current index to the opening statement array
        } else { // The following code will be executed if the current index is a closing statement
            if (openingStatements.length === 0) { // A validation check to see if the first index in the array is a closing statement, then return false
                return false;
            }
            let lastOpeningStatement = openingStatements.pop(); // Naming the last opening statement so we can check it with the current index (closing statement)
            if ((s[i] === ")" && lastOpeningStatement !== "(") || (s[i] === "}" && lastOpeningStatement !== "{") || (s[i] === "]" && lastOpeningStatement !== "[")) {
                // Above, we check if the current index (closing statement) is closing the unclosed previous opening statement which we had saved in the array
                return false;
            }
        }
    }
    return openingStatements.length === 0;
};