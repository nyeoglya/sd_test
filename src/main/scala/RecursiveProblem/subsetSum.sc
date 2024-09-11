/*
문제: "Subset Sum" 문제 (부분집합 합 문제)
설명: 주어진 배열에서, 배열의 모든 부분집합을 탐색하면서, 그 부분집합의 합이 특정 값 target과 같은지 확인하는 문제입니다. 이를 재귀적으로 해결해야 합니다.

문제: n개의 정수로 이루어진 배열 arr과 목표 값 target이 주어집니다. 이때, 배열 arr의 부분집합 중에서 합이 target과 같은 부분집합이 존재하는지 여부를 재귀를 사용하여 확인하는 함수를 작성하세요.

입력: 배열 arr: 정수들의 배열 (크기 n), 정수 target: 목표 합
출력: 부분집합의 합이 target과 같은 경우가 존재하면 true, 그렇지 않으면 false를 반환하는 함수

<예시>
입력: arr = [3, 34, 4, 12, 5, 2], target = 9
출력: true (부분집합 [4, 5]의 합이 9임)

입력: arr = [3, 34, 4, 12, 5, 2], target = 30
출력: false (어떤 부분집합도 합이 30이 되지 않음)
*/

def subsetSum(arr: List[Int], target: Int): Boolean = target match {
    case 0 => true
    case x if x < 0 => false
    case x if x > 0 => arr match {
        case head :: next => subsetSum(next, target - head) || subsetSum(next, target)
        case Nil => false
    }
}

println(subsetSum(List(3, 34, 4, 12, 5, 2), 9))
