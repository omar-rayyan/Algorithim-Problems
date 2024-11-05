function getSkyline(buildings) {
    let uncoveredBuildings = [];
    var highestBuilding = 0;
    for (let i = 0; i < buildings.length; i++) {
        if (buildings[i] > highestBuilding) {
            highestBuilding = buildings[i];
            uncoveredBuildings.push(buildings[i]);
        }
    }
    return uncoveredBuildings;
}

console.log(getSkyline([2, 4, 1 , 6, 5]));