'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'queensAttack' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER r_q
 *  4. INTEGER c_q
 *  5. 2D_INTEGER_ARRAY obstacles
 */

function queensAttack(n, k, r_q, c_q, obstacles) {
    // Write your code here
    const processedObstacles = obstacles.reduce((acc, o) => {
        if (!acc[o[0]]) acc[o[0]] = [o[1]];
        acc[o[0]] = acc[o[0]].concat(o[1]);
        return acc;
    }, {})
    const hasObstacle = (row, column) => {
        return processedObstacles[row] && processedObstacles[row].some(x => x === column)
    };

    let squaresQueenCanAttack = 0;
    
    // traverse left or right if you still can in at least one direction
    // traverse up or down if you still can in at least one direction
    let cl = c_q,
        cr = c_q,
        ru = r_q,
        rd = r_q,
        clu = c_q,
        rlu = r_q,
        crd = c_q,
        rrd = r_q,
        cru = c_q,
        rru = r_q,
        cld = c_q,
        rld = r_q;

    for (let i = 0; i < n - 1; i++) { // max number of moves in any direction is n - 1
        const nextCl = cl - 1;
        const nextCr = cr + 1;
        const nextRu = ru - 1;
        const nextRd = rd + 1;
        const nextClu = clu - 1;
        const nextRlu = rlu - 1;
        const nextCrd = crd + 1;
        const nextRrd = rrd + 1;
        const nextCru = cru + 1;
        const nextRru = rru - 1;
        const nextCld = cld - 1;
        const nextRld = rld + 1;

        if (nextCl > 0) {
            if (hasObstacle(r_q, nextCl)) {
                cl = 0;
            } else {
                squaresQueenCanAttack++;
                cl--;
            }
        }
        if (nextCr <= n) {
            if (hasObstacle(r_q, nextCr)) {
                cr = n;
            } else {
                squaresQueenCanAttack++;
                cr++;
            }
        }
        if (nextRu > 0) {
            if (hasObstacle(nextRu, c_q)) {
                ru = 0;
            } else {
                squaresQueenCanAttack++;
                ru--;
            }
        }
        if (nextRd <= n) {
            if (hasObstacle(nextRd, c_q)) {
                rd = n;
            } else {
                squaresQueenCanAttack++;
                rd++;
            }
        }
        // left up diagonal
        if (nextClu > 0 && nextRlu > 0) {
            if (hasObstacle(nextRlu, nextClu)) {
                clu = 0;
                // rlu = 0;
            } else {
                squaresQueenCanAttack++;
                clu--;
                rlu--;
            }
        }
        // right down diagonal
        if (nextCrd <= n && nextRrd <= n) {
            if (hasObstacle(nextRrd, nextCrd)) {
                crd = n;
                // rrd = n;
            } else {
                squaresQueenCanAttack++;
                crd++;
                rrd++;
            }
        }
        // right up diagonal
        if (nextCru <= n && nextRru > 0) {
            if (hasObstacle(nextRru, nextCru)) {
                cru = n;
                // rru = 0;
            } else {
                squaresQueenCanAttack++;
                cru++;
                rru--;
            }
        }
        // left down diagonal
        if (nextCld > 0 && nextRld <= n) {
            if (hasObstacle(nextRld, nextCld)) {
                cld = 0;
                // rld = n;
            } else {
                squaresQueenCanAttack++;
                cld--;
                rld++;
            }
        }
    }

    return squaresQueenCanAttack;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

    const n = parseInt(firstMultipleInput[0], 10);

    const k = parseInt(firstMultipleInput[1], 10);

    const secondMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

    const r_q = parseInt(secondMultipleInput[0], 10);

    const c_q = parseInt(secondMultipleInput[1], 10);

    let obstacles = Array(k);

    for (let i = 0; i < k; i++) {
        obstacles[i] = readLine().replace(/\s+$/g, '').split(' ').map(obstaclesTemp => parseInt(obstaclesTemp, 10));
    }

    const result = queensAttack(n, k, r_q, c_q, obstacles);

    ws.write(result + '\n');

    ws.end();
}
